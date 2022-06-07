class Enemy{
  float x;
  float y;
  float w;
  float mx;
  float my;
  
  Enemy(float tx, float ty, float tw){
    x = tx;
    y = ty;
    w = tw;
    mx = random(-1,1);
    my = random(-1,1);
  }
  
  void move(){
    x += mx;
    y += my;
    
    }
    
    void display(){
      
      fill(255,0,0);
      ellipse(x,y,w,w);
    }

void bounce(){ 
  if(x < 0 || x > width){
    mx *= -1;
  }
  if(y < 0 || y > height){
    my *= -1;
  }

}

}
