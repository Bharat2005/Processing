//Complex Bouncing Ball Assignment
float x;
float y;

float moveX;
float moveY;

void setup(){
size(600,600);

x = width/2; //assigning a value
y = 400;

moveX = 5;
moveY = 7;
}

void draw()
{
background(0);

if(x > width - 25 ){ //check for somethign
moveX *= -1;//multiplies
}
else if(x < 25)
{
moveX *= -1;
}

if (y > height - 25)
{
moveY *= -1;
}
else if (y < 25)
{
  moveY *= -1;
}

x += moveX;
y += moveY;

if(dist(x,y, mouseX, mouseY) < 50 ){
fill(255);
println("distance is: " + dist(x,y, mouseX, mouseY) );
}
//top left 
else if (x <= width/2 && y <= height/2){//else will run if the statements above are not true
fill(0,255,255);
}
//bottom left
else if (x <= width/2 && y > height/2){
  fill(0,0,255);
}
//top right
else if (x >= width/2 && y <= height/2){
  fill(0,255,0);
}
//bottom right
else if (x >= width/2 && y > height/2){
  fill(255,0,255);
}

ellipse(x,y, 50,50);
}