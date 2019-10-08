#define _USE_MATH_DEFINES
#include <cmath>
#include <iostream>

enum class PointType
{
  cartesian,
  polar
};

class Point
{
  /*Point(float a, float b, PointType type = PointType::cartesian)
  {
  if (type == PointType::cartesian)
  {
  x = a; b = y;
  }
  else
  {
  x = a*cos(b);
  y = a*sin(b);
  }
  }*/

  Point(const double x, const double y)
    : x{x},
      y{y}
  {
  }
double x, y;
public:

  friend std::ostream& operator<<(std::ostream& os, const Point& obj)
  {
    return os
      << "x: " << obj.x
      << " y: " << obj.y;
  }

  static Point NewCartesian(double x, double y)
  {
    return{ x,y };
  }
  static Point NewPolar(double r, double theta)
  {
    return{ r*cos(theta), r*sin(theta) };
  }
};

int main()
{
  // will not work
  //Point p{ 1,2 };

  Point p = Point::NewPolar(5, M_PI_4);
  std::cout << p << std::endl;

  return 0;
}