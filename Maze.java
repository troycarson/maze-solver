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
  * FILE:				Maze
  * 
  * DESCRIPTION: 		This file contains the methods and constructor for my Maze class 
  * 
  *************************************************************************************/
import java.util.*;
import java.io.*;
public class Maze {
	private Grid myGrid;
	private int rows;
	private int columns; 
	String fileName;
	/*************************************************************************************
   	* 
   	* Method: 			Maze
  	* 
   	* Description: 		constructor
  	* 
   	* @param 			int, int, String
   	* 
  	* @return 			None
   	* 
   	************************************************************************************/
	public Maze(int numRows, int numCols, String filename){
		myGrid = new Grid(numRows, numCols);
		rows = numRows;
		columns = numCols;
		filename = filename;
		try{
			Scanner scanner = new Scanner(new FileReader(filename));
			for (int i = 0; i < numRows; i++){
				for (int j = 0; j < numCols; j++){
					myGrid.setData(i, j, scanner.next());
				}
			}
		}
		catch (Exception e){
			System.out.println(filename + " not found. Relaunch the program and try again.");
		}
	}
	/*************************************************************************************
   	* 
   	* Method: 			findExutUsingStack
  	* 
   	* Description: 		Traverses through the maze using a Stack. If there is no start, print “This maze has no start!” If an exit cannot be found then print, “No exit was found.” Otherwise, as soon as an exit has been found, stop traversing through the maze, and print, “You have found the exit!” Each time a cell is visited, print the maze
  	* 
   	* @param 			None
   	* 
  	* @return 			None
   	* 
   	************************************************************************************/
	public void findExitUsingStack(){
		
	}
	/*************************************************************************************
   	* 
   	* Method: 			findExutUsingQueue
  	* 
   	* Description: 		Traverses through the maze using a Queue. If there is no start, print “This maze has no start!” If an exit cannot be found then print, “No exit was found.” Otherwise, as soon as an exit has been found, stop traversing through the maze, and print, “You have found the exit!” Each time a cell is visited, print the maze
  	* 
   	* @param 			None
   	* 
  	* @return 			None
   	* 
   	************************************************************************************/
	public void findExitUsingQueue(){
		
	}
	/*************************************************************************************
   	* 
   	* Method: 			resetMaze
  	* 
   	* Description: 		Resets the maze using the initial file.
  	* 
   	* @param 			None
   	* 
  	* @return 			None
   	* 
   	************************************************************************************/
	public void resetMaze(){
		myGrid = new Grid(rows, columns);
		try{
			Scanner scanner = new Scanner(new FileReader(fileName));
			for (int i = 0; i < rows; i++){
				for (int j = 0; j < columns; j++){
					myGrid.setData(i, j, scanner.next());
				}
			}
		}
		catch (Exception e){
			System.out.println(fileName + " not found. Relaunch the program and try again.");
		}
	}
	/*************************************************************************************
   	* 
   	* Method: 			toString
  	* 
   	* Description: 		Returns a String representation of the maze. 
  	* 
   	* @param 			None
   	* 
  	* @return 			String
   	* 
   	************************************************************************************/
	public String toString(){
		String output = "";
		for (int i = 0; i < rows; i++){
			for (int j = 0; j < columns; j++){
				output += myGrid.getData(i, j) + " ";
			}
			output += "\n";
		}
		return output;
	}
}
