# To change this template, choose Tools | Templates
# and open the template in the editor.

$:.unshift File.join(File.dirname(__FILE__),'..','lib')

require 'test/unit'
require 'week'
require 'day'

class WeekTest < Test::Unit::TestCase
  def test_week
    week = Week.new 2010,6

    assert_equal(7, week.days.length)

    assert_equal('Monday', week.days[0].week_day)
    assert_equal('Sunday', week.days[6].week_day)
  end
end
