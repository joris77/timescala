require 'rubygems'
require 'sinatra'
require 'dm-core'


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

get 'month/:month' do
  
end
