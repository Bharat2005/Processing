float x;
float y;
float w;

Enemy[] enemies;

void setup(){
  size(500,500);
  
  x = width/2;
  y = height/2;
  w = 25;
  enemies = new Enemy[20];
  
  for(int i = 0; i < enemies.length; i++){
   enemies[i] = new Enemy(random(0,width), 
                           random(0,height),
                            40);
 }
 
}

 void draw(){
   background(0);
   
     
   fill(255);
   
   for (int i = 0; i < enemies.length; i++){
     
   float d = dist(x,y, enemies[i].x, enemies[i].y);
   
   if(d < w/2 + enemies[i].w/2){
    background(random(100,255),random(100,255), random(100,255));
    //setup();
   }
   enemies[i].move();
   enemies[i].bounce();
   enemies[i].display();
   
   }
   
  movePlayer();
  displayPlayer();
}
