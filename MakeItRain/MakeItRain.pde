ArrayList<Ball> ballList;

void setup(){
  size(600,600);
  
  ballList = new ArrayList<Ball>();
  
  
}

void draw(){
  background(0);
  
  for(int i = 0; i < ballList.size(); i++){
    Ball b = ballList.get(i);
    b.move();
    b.display();
    
    if (b.isDead() ){
      ballList.remove(i);
    } 
  }

  
}

void mousePressed(){
  ballList.add(new Ball() );
  print("created ball");
  
}
