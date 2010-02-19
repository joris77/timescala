require 'dm-core'

class TimeRegistration
  include DataMapper::Resource

  property :id,               Serial
  property :hours,            BigDecimal
  property :description,      String
end
