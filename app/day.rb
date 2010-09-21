# To change this template, choose Tools | Templates
# and open the template in the editor.

class Day
  def initialize year, week, day
    @date = Date.commercial(year, week, day)
  end

  def week_day
    case @date.wday
    when 0
      "Sunday"
    when 1
      "Monday"
    when 2
      "Tuesday"
    when 3
      "Wednessday"
    when 4
      "Thursday"
    when 5
      "Friday"
    when 6
      "Saturday"
    end
  end

  def working_day?
    if 0 == @date.wday || 6  == @date.wday
      false
    else
      true
    end
  end

  def wday
    @date.wday
  end

  def day
    @date.day
  end

  def to_s
    @date.to_s
  end

  def to_json(*a)
    {'day_of_month' => @date.day}.to_json(*a)
  end
end
