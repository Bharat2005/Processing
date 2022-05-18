//Circle following mouse slowely effect
float posX = 0;
float posY = 0;

float dX = 0;
float dY = 0;

void setup()
{
  size(1024,768);
}

void draw()
{
  background(0);
  
  fill(255);
  
  dX = mouseX - posX; // gets the distance between the x coords
  dY = mouseY - posY; // gets the distance between the y coords
  
  dX *= 0.05;
  dY *= 0.05;
  
  posX += dX; //adds to the x coordinate of the circle
  posY += dY; // adds to the y coordin ates of the circle
  
 onCircle();
  
  ellipse(posX, posY, 50, 50); 
}

void onCircle()// checks if the mouse is on the circle or not
{
  float d = dist(mouseX, mouseY, posX, posY);
  
  if (d < 25)
  {
    fill (255, 0, 0);
  }
  else
  {
    fill(255);
  }
}
  