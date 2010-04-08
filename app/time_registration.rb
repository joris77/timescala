require 'dm-core'

class TimeRegistration
  include DataMapper::Resource

  property :id,               Serial
  property :start,            DateTime
  property :end,              DateTime
  property :description,      String

  def TimeRegistration.registrations_for_month month
    all(:start.gt => month.month_begin, :end.lt => month.month_end,:order => [:start])
  end
end
