<h1>TOY_MANUFACTURER</h1>

<h3>Question 1: </h3>
A toy manufacturer makes cuddly toys of four types in three sizes. Some toys are teddy bears, and some are bunny rabbits.<br>
Blue teddy bears are dressed as engine drivers. and red ones as gardeners. White bunnies are dressed as clowns, and black ones as bank managers.<br>
Teddies make a growling noise, whereas bunny rabbits squeak. All toys can say what job they do, what their colour is and what size they are.<br><br>

Model the classes as described above in a hierarchy, the highest level of which should be the base class 'Cuddly Toy'.<br>
'There should be, an intermediate level of classes Teddy' and 'Bunny', and at the lowest level classes of 'engine driver, 'gardener', 'clown' and 'bank manager'. <br>
Instantiate objects of these classes dynami-cally via a base class pointer, setting the size of the toy via a parameter to the constructor. Use class attributes as appropriate.<br> 
Demonstrate a method which wallows the toy to make a noise and tell us about itself.<br>

             Cuddly_Toy (Base_Class)
                          ↓
        ┌─────────────────┴─────────────────┐
        ↓                                   ↓
     Teddy                             Bunny  (Intermediate_Class)
        ↓                                   ↓
  ┌─────┴──────┐                     ┌───────┴────────────┬
  ↓            ↓                     ↓                    ↓           
Engine_driver  Gardeners         Bank_manager           Clown      
