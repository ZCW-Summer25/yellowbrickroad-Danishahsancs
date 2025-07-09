package rocks.zipcode.dreamhouse;

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square nighttime;
    private Square grass1;
    private Circle moon;
    private Circle cirwin;
    private Circle cirwinbor;
    private Square road1;
    private Square m1;
    private Square m2;
    private Square m3;    
    private Square m4;
    private Square housebody;
    private Triangle roof;
    private Square garage;
    private Square door;
    private Circle doorknob;
    private Square chimney;
    private Square win1;
    private Square win2;
    private Square winbar1;
    private Square winbar2;
    private Square winbar3;
    private Square winbar4;
    private Square winbar5;
    private Square winbar6;
    private Square winborder1;
    private Square winborder2;
    private Circle cloud1;
    private Circle cloud2;
    private Circle cloud3;
    private Circle cloud4;
    private Circle cloud5;
    private Circle cloud6;
    private Circle cloud7;
    private Circle cloud8;
    private Circle cloud9;
    private Square treestem;
    private Triangle tree1;
    private Triangle tree2;
    private Triangle tree3;



    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        nighttime = new Square();
        nighttime.moveVertical(-100);
        nighttime.moveHorizontal(-100);
        nighttime.changeSize(350,350);
        nighttime.changeColor("blue");
        nighttime.makeVisible();

        grass1 = new Square();
        grass1.changeColor("green");
        grass1.moveHorizontal(-60);
        grass1.moveVertical(150);
        grass1.changeSize(100,300);;
        grass1.makeVisible();

        road1 = new Square();
        road1.changeColor("black");
        road1.changeSize(100,40);
        road1.moveVertical(150);
        road1.moveHorizontal(40);
        road1.makeVisible();

        m1 = new Square();
        m1.changeColor("yellow");
        m1.changeSize(20, 3);
        m1.moveHorizontal(60);
        m1.moveVertical(150);
        m1.makeVisible();

        m2 = new Square();
        m2.changeColor("yellow");
        m2.changeSize(20, 3);
        m2.moveHorizontal(60);
        m2.moveVertical(180);
        m2.makeVisible();

        m3 = new Square();
        m3.changeColor("yellow");
        m3.changeSize(20, 3);
        m3.moveHorizontal(60);
        m3.moveVertical(210);
        m3.makeVisible();

        m4 = new Square();
        m4.changeColor("yellow");
        m4.changeSize(20, 3);
        m4.moveHorizontal(60);
        m4.moveVertical(240);
        m4.makeVisible();



        housebody = new Square();
        housebody.changeColor("lightgray");
        housebody.changeSize(75, 200);
        housebody.moveVertical(75);
        housebody.moveHorizontal(20);
        housebody.makeVisible();

        cirwinbor = new Circle();
        cirwinbor.changeColor("gray");
        cirwinbor.moveHorizontal(83);
        cirwinbor.moveVertical(68);
        cirwinbor.changeSize(34);
        cirwinbor.makeVisible();
        
        cirwin = new Circle();
        cirwin.changeColor("cyan");
        cirwin.moveHorizontal(85);
        cirwin.moveVertical(70);
        cirwin.changeSize(30);
        cirwin.makeVisible();

        winbar5 = new Square();
        winbar5.changeColor("gray");
        winbar5.changeSize(30, 3);
        winbar5.moveHorizontal(59);
        winbar5.moveVertical(80);
        winbar5.makeVisible();

        winbar6 = new Square();
        winbar6.changeColor("gray");
        winbar6.changeSize(3, 30);
        winbar6.moveHorizontal(45);
        winbar6.moveVertical(93);
        winbar6.makeVisible();
        

        chimney = new Square();
        chimney.changeColor("black");
        chimney.changeSize(20, 10);
        chimney.moveHorizontal(170);
        chimney.moveVertical(40);
        chimney.makeVisible();

        roof = new Triangle();
        roof.changeColor("red");
        roof.changeSize(35, 240);
        roof.moveVertical(75);
        roof.moveHorizontal(128);
        roof.makeVisible();

        garage = new Square();
        garage.changeColor("gray");
        garage.changeSize(30, 50);
        garage.moveVertical(120);
        garage.moveHorizontal(35);
        garage.makeVisible();

        door = new Square();
        door.changeColor("gray");
        door.changeSize(50, 30);
        door.moveVertical(100);
        door.moveHorizontal(150);
        door.makeVisible();

        doorknob = new Circle();
        doorknob.changeColor("yellow");
        doorknob.changeSize(5);
        doorknob.moveVertical(110);
        doorknob.moveHorizontal(210);
        doorknob.makeVisible();

        winborder1 = new Square();
        winborder1.changeColor("gray");
        winborder1.changeSize(29, 29);
        winborder1.moveHorizontal(115);
        winborder1.moveVertical(103);
        winborder1.makeVisible();

        winborder2 = new Square();
        winborder2.changeColor("gray");
        winborder2.changeSize(29, 29);
        winborder2.moveHorizontal(186);
        winborder2.moveVertical(103);
        winborder2.makeVisible();

        win1 = new Square();
        win1.changeColor("cyan");
        win1.changeSize(25, 25);
        win1.moveVertical(105);
        win1.moveHorizontal(117);
        win1.makeVisible();

        win2 = new Square();
        win2.changeColor("cyan");
        win2.changeSize(25, 25);
        win2.moveVertical(105);
        win2.moveHorizontal(188);
        win2.makeVisible();

        winbar1 = new Square();
        winbar1.changeColor("gray");
        winbar1.changeSize(25, 3);
        winbar1.moveHorizontal(200);
        winbar1.moveVertical(105);
        winbar1.makeVisible();

        winbar2 = new Square();
        winbar2.changeColor("gray");
        winbar2.changeSize(3, 25);
        winbar2.moveHorizontal(188);
        winbar2.moveVertical(115);
        winbar2.makeVisible();

        winbar3 = new Square();
        winbar3.changeColor("gray");
        winbar3.changeSize(25, 3);
        winbar3.moveHorizontal(128);
        winbar3.moveVertical(105);
        winbar3.makeVisible();

        winbar4 = new Square();
        winbar4.changeColor("gray");
        winbar4.changeSize(3, 25);
        winbar4.moveHorizontal(117);
        winbar4.moveVertical(115);
        winbar4.makeVisible();

        moon = new Circle();
        moon.changeColor("gray");
        moon.moveHorizontal(240);
        moon.moveVertical(-50);
        moon.changeSize(30);
        moon.makeVisible();

        cloud1 = new Circle();
        cloud1.changeColor("white");
        cloud1.moveVertical(0);
        cloud1.moveHorizontal(0);
        cloud1.changeSize(30);
        cloud1.makeVisible();

        cloud2 = new Circle();
        cloud2.changeColor("white");
        cloud2.moveVertical(-15);
        cloud2.moveHorizontal(13);
        cloud2.changeSize(30);
        cloud2.makeVisible();

        cloud3 = new Circle();
        cloud3.changeColor("white");
        cloud3.moveVertical(0);
        cloud3.moveHorizontal(26);
        cloud3.changeSize(30);
        cloud3.makeVisible();

        cloud4 = new Circle();
        cloud4.changeColor("white");
        cloud4.moveVertical(0);
        cloud4.moveHorizontal(230);
        cloud4.changeSize(30);
        cloud4.makeVisible();

        cloud5 = new Circle();
        cloud5.changeColor("white");
        cloud5.moveVertical(-15);
        cloud5.moveHorizontal(243);
        cloud5.changeSize(30);
        cloud5.makeVisible();

        cloud6 = new Circle();
        cloud6.changeColor("white");
        cloud6.moveVertical(0);
        cloud6.moveHorizontal(256);
        cloud6.changeSize(30);
        cloud6.makeVisible();

        cloud7 = new Circle();
        cloud7.changeColor("white");
        cloud7.moveVertical(-25);
        cloud7.moveHorizontal(110);
        cloud7.changeSize(30);
        cloud7.makeVisible();

        cloud8 = new Circle();
        cloud8.changeColor("white");
        cloud8.moveVertical(-40);
        cloud8.moveHorizontal(123);
        cloud8.changeSize(30);
        cloud8.makeVisible();

        cloud9 = new Circle();
        cloud9.changeColor("white");
        cloud9.moveVertical(-25);
        cloud9.moveHorizontal(133);
        cloud9.changeSize(30);
        cloud9.makeVisible();

        
        treestem = new Square();
        treestem.changeColor("black");
        treestem.changeSize(50, 10);
        treestem.moveVertical(130);
        treestem.moveHorizontal(-30);
        treestem.makeVisible();
       
        tree1 = new Triangle();
        tree1.changeColor("green");
        tree1.changeSize(40, 60);
        tree1.moveVertical(130);
        tree1.moveHorizontal(-15);
        tree1.makeVisible();

        tree2 = new Triangle();
        tree2.changeColor("green");
        tree2.changeSize(40, 60);
        tree2.moveVertical(110);
        tree2.moveHorizontal(-15);
        tree2.makeVisible();

        tree3 = new Triangle();
        tree3.changeColor("green");
        tree3.changeSize(40, 60);
        tree3.moveVertical(90);
        tree3.moveHorizontal(-15);
        tree3.makeVisible();
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(nighttime != null)   // only if it's painted already...
        {
            nighttime.changeColor("black");
            grass1.changeColor("white");
            moon.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(nighttime != null)   // only if it's painted already...
        {
            nighttime.changeColor("red");
            grass1.changeColor("black");
            moon.changeColor("yellow");
        }
    }

}
