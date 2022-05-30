float c = 0;

void setup(){
  size(1024, 768);
}

void draw(){
  background(0);
  
  fill(nearCircle()); // this function will change the color
  

  ellipse(width/2,height/2, 100, 100); // height and width refer to the size of the screen
}

int nearCircle(){
  float d = dist(mouseX, mouseY, width/2, height/2);
  
  c = lerp(255, 0, d/600);
  
  return int(c); //cast operator forced to int
}
