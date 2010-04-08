# To change this template, choose Tools | Templates
# and open the template in the editor.

class Week

  attr_accessor :days

  def initialize year, weekNumber
    @year = year
    @weekNumber = weekNumber
    @days = []
    (1..7).to_a.each { |day|
      @days<<(Day.new(year,weekNumber,day))
    }
  end

  def to_json(*a)
    {'weekNumber' => @weekNumber, 'days' => @days}.to_json(*a)
  end
end
