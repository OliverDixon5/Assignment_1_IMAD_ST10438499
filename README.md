# ST10438499_OliverDixon_IMAD_Assignment1

The goal of creating the program was to create a mobile application that would compare famous figures in history to the user's age. The app would take the user’s input and match it against a historical figure and display some information about the person. 

To complete this task, I had to plan and create a mind map of what I needed before I started programming. There was going to be a place where the user could enter their age and two buttons that would perform functions that would compare the user’s age and the historical figure when pressed and the other button would reset the program so that the user could keep entering ages to see who they compare against. 

Once I had the mind map, I created a emulator so that i could run and test my code. I decided to use a Google Pixel 7 pro as it has good resolution and will be the base of my project.
![image](https://github.com/VCCT-IMAD5112-2024-G1/Assignment_1_IMAD_ST10438499/assets/164025499/b0309353-1b8f-4dbe-9d81-91052b2d9d92)

I then had a blank enviroment that i had to build upon.The first thing i was going to implement was a backround to do this i got a jpeg image of old paper that was stained this would help link to the history theme and uploaded it to android studio where i could then set it as the background. When i created the backround i set it to the phones resolution so it would have a higher quality image.
![image](https://github.com/VCCT-IMAD5112-2024-G1/Assignment_1_IMAD_ST10438499/assets/164025499/3eb2eb87-dd26-42dc-a5b3-337001db4c1c)

After the backround was set i needed to create a user interface, i aimed for a simplistic look and not for anything stand out too much. I needed to add components to add functions and uses to them.
I added an text view component that was going to contain the header so that the user could have a base to the name of the project. The size of the text was too small for the header of the app so i increased it to 40sp using the attributes tab. The characters of the header didnt stand out enough and thus i made the text bold.
![image](https://github.com/VCCT-IMAD5112-2024-G1/Assignment_1_IMAD_ST10438499/assets/164025499/26da94d2-e01f-49d9-ae20-84ad8d529cf3)

I added an edit text component that was going to be an area where the user could enter their age to get the user input so that functions can use it for calculations and methods. It had an area for user hints so i made it so the user could understand that they need to enter their age into that text box. To prevent later errors when the user has to enter their age i added a syntax command in the xml of the activity main so they could only enter whole numbers.
![image](https://github.com/VCCT-IMAD5112-2024-G1/Assignment_1_IMAD_ST10438499/assets/164025499/9a7315c5-db84-44d3-8023-424c642c3127)

I added text view 2 component that was going to be a place holder for displaying the historical figure and infomation about them. By using "" parenthesis you can use it as a place holder so no text shows up this made the text view transparent and could later be edited in the main activity. This would allow for less clutter being on the screen and allowing me to display text and change the backround color later on.
![image](https://github.com/VCCT-IMAD5112-2024-G1/Assignment_1_IMAD_ST10438499/assets/164025499/d6558cb2-6ae2-4b7d-8c26-3d3799aeb144)

I needed something for the user to interact with so that the calculations could be done so I added two buttons one would activate the function of comparing the age of the user with the historical figure sending what was meant to be displayed to text view 2 with a background behind the text. The second button would clear the text and backround that was added reseting the app and allowing the user to enter another age.
Before i got to programming the functions for the buttons i dragged and dropped the components onto the main activity and constrained them in the center for a more appealing view.

After that i then needed to create an id name and bind it ti string so i could later set the names of the components. Once they where set i created the names of what i wanted the components to display. Once their id's and names where set and binded i added them to the xml of the main activity so that it would change the text.
![image](https://github.com/VCCT-IMAD5112-2024-G1/Assignment_1_IMAD_ST10438499/assets/164025499/a395c679-371a-4da2-ac32-8531da756f55)

My ui was looking better but the buttons stood out as they where not the same color as the background and where square. So i found the colour of the background in hexadecimal and saved it in a newly created color xml where i could then set the color of the button to the variable i created using the attributes tab i also made the buttons 25% transparent so they would blend into the background better.
![image](https://github.com/VCCT-IMAD5112-2024-G1/Assignment_1_IMAD_ST10438499/assets/164025499/5470fce5-4ca7-4734-8530-b9714fdba79e)

The square buttons didnt fit in so i changed them to round corners but keeping their block like look i used to corner radius syntax command in the xml of the activity main to achieve this.
![image](https://github.com/VCCT-IMAD5112-2024-G1/Assignment_1_IMAD_ST10438499/assets/164025499/a68e0ee3-b9a6-4950-93f5-531bc5b42197)

In the xml of the code i added a syntax command so that all the text was centered to match how the layout of the app was set up.
