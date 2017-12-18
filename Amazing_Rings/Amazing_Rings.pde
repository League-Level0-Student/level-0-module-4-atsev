int x;
int a=500;
int speed=2;
void setup(){
   size(500,500);
   noFill();
}
void draw(){
  background(250,250);
for (int i=250; i>0; i-=10) {
  ellipse(x, 250, i, i);
  ellipse(a, 250, i, i);
}
x=x+speed;
a=a-speed;
if(x==500||a==0||x==0||a==500) {
speed=-speed;
}
}