//RGB Quadrant assignment
color c;
color c2;
color c3;
color c4;
int mynumber;

void setup(){
size(400,600);

noStroke();//this gets rid of the outline

c = color(0,255,0);//rgb
c2 = color(255,0, 0);
c3 = color (0,0,255);
c4 = color (100,50,150);
//colour takes 3 variables (rgb)
}



void draw(){

background(0);

//top left
if(mouseX <= width/2 && mouseY <= height/2){//&& means 'and'
fill(c);
rect(0,0, width/2, height/2);
}
//bottom left
else if(mouseX <= width/2 && mouseY > height/2){
fill(c2);
rect(0,height/2, width/2, height/2);
}

//top right
if(mouseX >= width/2 && mouseY <= height/2){//&& means 'and'
fill(c3);
rect(200,0, width/2, height/2);
}
//bottom right
else if(mouseX >= width/2 && mouseY > height/2){
fill(c4);
rect(width/2,height/2, width/2, height/2);
}
}