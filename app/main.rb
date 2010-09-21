require 'rubygems'
require 'sinatra'
require 'dm-core'
require 'json'


Dir['*.rb'].each{|file_name|
  load file_name if file_name != 'main.rb'
}

configure :development do
  DataMapper.setup(:default, {
      :adapter  => 'postgres',
      :host     => 'localhost',
      :username => 'joris77' ,
      :password => 'password',
      :database => 'timesheet_development'})

  DataMapper::Logger.new(STDOUT, :debug)
end

get '/timesheet/:year/:month' do
  content_type :json
  registrations = TimeRegistration.registrations_for_month(Month.new(params[:year].to_i,params[:month].to_i)).to_a
  JSON.generate(registrations)
end
