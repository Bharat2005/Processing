 class Ball{
   float x;
   float y;
   float w;
   float moveY;
   
   //Constructor
   Ball(){
     x = mouseX;
     y = mouseY;
     w =10;
     moveY = random (3, 10); //give a random value
     
   }
   
   void display(){
     fill (255);
     ellipse(x,y,w,w);
   }
   
   void move(){
     y += moveY;
   }
   
   boolean isDead(){
     if (y > height -100){
       return true;
     }
     else{
       return false;
     }
   }
   
 }
 
 
