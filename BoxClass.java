public class Box
{
private int l,b,h,vol;
public Box()
{
l=10;
b=20;
h=30;
}
public String toString()
{
return "Length = "+l+"\n Breadth = "+b+" and height = "+h;
}
public Box(int x,int y,int z)
{
l=x;
b=y;
h=z;
}
public Box(Box x)
{
l=x.l;
b=x.b;
h=x.h;
}
public Box(int x,int y)
{
l = x;
b = y;
h = 5;
}
public Box(int x)
{
l = x;
b = x;
h = x;
}
public void setA(int x)
{
l = x;
}
public void setB(int y)
{
 b = y;
}
public void setC(int z)
{
h = z;
}
public void volume()
{
vol = l*b*h;
}
public int getVolume()
{
return vol;
}
}
