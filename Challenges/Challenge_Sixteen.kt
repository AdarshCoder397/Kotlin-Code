/**************************************************************************************
* QUESTION:
* Read the input string and duplicate it in the file MyFile.txt.
* Examples:
*
* 1) Input string:
*
* Yohoho!
*
* After we have launched the code:
*
* Yohoho!Yohoho!
*
* 2) Input string:
*
* meow
*
* After we have launched the code:
*
* meowmeow
***********************************************************************************/

// SOLUTION
    val text = readLine()!!
    val myFile = File("MyFile.txt")
    myFile.writeText("$text$text")
