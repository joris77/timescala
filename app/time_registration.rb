require 'dm-core'

class TimeRegistration
  include DataMapper::Resource

  property :id,               Serial
  property :hours,            BigDecimal
  property :start,            DateTime
  property :end,              DateTime
  property :description,      String
end
