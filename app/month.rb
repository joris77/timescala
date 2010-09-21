# To change this template, choose Tools | Templates
# and open the template in the editor.

class Month

  attr_accessor :weeks

  def initialize year,month
    @year = year
    @month = month
    #    first_of_the_month = Date.civil_to_jd year, month, 1
    #    start_week = Date.jd_to_commercial(first_of_the_month)[1]
    #    end_week = Date.jd_to_commercial(last_day)[1]
    #    @weeks = []
    #    (start_week..end_week).each { |weekNumber|
    #      @weeks<<(Week.new(year, weekNumber))
    #    }
  end

  def to_json(*a)
    {'year' => @year, 'month' => @month, 'weeks' => @weeks}.to_json(*a)
  end

  def last_day
    d = Date.new @year, @month
    d += 42
    DateTime.new(d.year, d.month,1) - 1
  end
  
  def month_end
    last_day
  end

  def month_begin
    DateTime.new(@year, @month)
  end

  
  
end
