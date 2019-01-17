# TestDrivenDevelopment_Activity

This is a program intended to demo Test Driven Development

The project is implemented alongside JUnit Test Cases in the Eclipse IDE

At initial stage, the input to the function is "String" but due to change in product it is later changed to "String Array"

This program has 10 minimum cases of output which is according to the input. 

Outputs:- 
  1. For NULL: You is amazing
  2. For "": You is amazing
  3. For {"Romil"} - (Single Mixed Case Name): Romil is amazing
  4. For {"ROMIL"} - (Single Upper Case Name): ROMIL IS AMAZING
  5. For {"Peter","Satya"} - (Two Mixed Case Names): Peter and Satya are amazing
  6. For {"Peter","Aditya","Satya"} - (Multiple Mixed Case Names): Peter, Aditya, and Satya are amazing
  7. For {"ROMIL","PETER"} - (Two Upper Case Names): ROMIL AND PETER ARE AMAZING
  8. For {"ROMIL","PETER","JIGISHA"} - (Multiple Upper Case Names): ROMIL, PETER, AND JIGISHA ARE AMAZING
  9. For {"ROMIL","Peter"} - (Single Combination Names): Peter is amazing. ROMIL ALSO!
  10. For {"ROMIL","Peter","PRITESH","Jenelle"} - (Two Combination Names): Peter and Jenelle are amazing. ROMIL AND PRITESH ALSO!
  11. For {"ROMIL","Peter","PRITESH","Jenelle","ROHIT","Albert"} - (Multiple Combination Names): Peter, Jenelle, and Albert are amazing. ROMIL, PRITESH, AND ROHIT ALSO!
  
  Other Combinations may exist as well.
