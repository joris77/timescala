# To change this template, choose Tools | Templates
# and open the template in the editor.

$:.unshift File.join(File.dirname(__FILE__),'..','lib')

require 'test/unit'
require 'day'

class DayTest < Test::Unit::TestCase
  def test_working_day
    assert_true(Day.new(2010,5,1).working_day?())
  end
end
