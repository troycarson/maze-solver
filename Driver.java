/**************************************************************************************
  * 
  * NAME:				Troy Carson
  * 
  * HOMEWORK:			6
  * 
  * CLASS:				ICS 211
  * 
  * INSTRUCTOR:			Scott Robertson
  * 
  * FILE:				Driver
  * 
  * DESCRIPTION: 		This file contains the driver to test my Maze class
  * 
  *************************************************************************************/
public class Driver {
	public static void main(String[] args){
		Maze myMaze = new Maze(4, 5, "maze1.txt");
		System.out.println(myMaze.toString());
	}
}
