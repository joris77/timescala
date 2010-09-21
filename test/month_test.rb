# To change this template, choose Tools | Templates
# and open the template in the editor.

$:.unshift File.join(File.dirname(__FILE__),'..','lib')

require 'test/unit'
require 'month'
require 'week'
require 'day'

class MonthTest < Test::Unit::TestCase
  def test_month
    month =  Month.new(2010, 02)
    assert_equal(4, month.weeks.length)
  end
end
