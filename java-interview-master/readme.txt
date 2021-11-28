    Once at school, when I could not solve the problem right away, the teacher told me: "Think aloud.
It is also interesting to observe this", therefore, I thought it would be good to write down how
I thought while performing this task, so that It could be possible evaluate not only what I know, but also the way I think.

    When I received the task, the first problem arose when I needed to figure out how to save the entire repository to myself
computer, because in this form, I could not understand anything that was there. Lucky, this problem was solved quickly, in a few minutes
googling. It's always a lottery when it comes to googling. The problem can be solved in a few minutes, or it can take a week.
After the project was loaded into the development environment, i immediately became calmer,
because the eye caught the familiar structure of the project.

    The challenge is simple.
        Accept the data -> check it -> calculate the cost -> send the data further.

    After reviewing the project that was already given to me, I concluded that receiving and sending data has already been done for me in the controller.
It's really great when the code reads like English text. Although the controller met me with a bunch of unfamiliar code,
I was able to grasp its structure and purpose thanks to these lines

        return ResponseEntity.ok (productService.validateProduct (product));

        return ResponseEntity.ok (productService.calculateProductCost (product));

     Here I realized that we are referring to two methods of the ProductService class where we perform data validation,
and then calculate the cost. I realized that receiving and sending data was implemented for me,
because we are already passing some product object to the validateProduct() method, which means that the finished object
has already been received at this place and I need to focus on the validateProduct() method. Looking there,
I realized that it is an empty method that does nothing. It gets an object and then returns it without doing anything.
Same with the calculation of the cost. I regarded these two methods as my area of responsibility.

    The very concept of data validation is clear to me. It is necessary to install a filter so that various trash does not get into the working mechanism,
which he will not cope with. However, I've never had to create data validation. After I did the research,
I realized that there are an unimaginable multitude of options for where you can put the filter and how it might look. Though
I remember such a thing as application architecture, but this is where my knowledge in this area ends. I only know
that the code should be clean and easy to maintain. After two days of searching for possible validation options, I figured
that it should be limited to the one method, because the whole structure of the project seems to hint that everything is already ready,
and here are two empty methods for two tasks. However, I am very worried that as an argument of the method I get an object of type object.
I tried to access its methods and found that there are no fields of the Product class, only methods of the Object class.
And I don't know how I should solve this problem. On the one side, there are two empty methods where my code should be. On the other side,
I do not know how I can refer to the fields of the object I need. Should I somehow access the Product via Object
or i need to add some kind of dependency or is the Object object argument also just a plug to be rewritten? However, if I change the Object object
to Product product in the method arguments, then there is need to edit the controller. The assignment indicated
"create a Spring boot application", then it can be wasted that my area of responsibility is the entire application
and the wireframe already created is just a little hint, a push in the right direction. But if i think so, then the options,
how i can write validation becomes a huge set again, and I'm just lost. Moreover, the second method should
calculate the cost of the product. Cost is a number and the method returns Object. No matter how I thought, but I could not imagine
how do I need to pass a number through Object, which means the method must return int, and this is another argument in favor of
that I will need to change not only these two methods. I have heard something about converting types down and up the hierarchy, but
I'm not sure how good this solution is in terms of architecture and/or code purity, so I decided to just change
types of arguments.

    Since now I do not have a mentor who could tell me, so I have two options to choose from - continue to try to find a ready
answer on the Internet or try to create my own solution based on my knowledge. As it was said on one programming YouTube channel:
"You don't need to reinvent the wheel. Everything you need has long been invented for you, you need
just know how to use it ", so I would still like to find a ready-made solution on the Internet, but information on this topic is
a lot that I just get lost in it. As i said, googling is a little bit a lottery. But if I write my solution to the problem, I have a fear that after this recruiting
the process will end and no one will talk to me.


    If yesterday I had no idea of how I would solve the problem posed, today everything is different.
This is most likely due to the pressure of time and the resolved inaccuracy with the cost estimate. Yesterday and the day before yesterday I understood that
I have time to think, search, analyze, but today is the two days before the deadline, and while remember about speed
with which I solved the task before, I realized that I did not have time to think and it was time to choose. And the moment I realized
that my choice of what I can do has been drastically reduced, making the choice much easier. The solution became clear and obvious -
I do what first came to my mind from the very beginning, I no longer have time to choose.
    And the second thing that helped me clear my head was the solution to that little inaccuracy. Because I couldn't understand
how to calculate the price of a product, uncertainty was created. And a lot of things could fit into this uncertainty, even
despite the fact that I had only one idea what it could be. After the uncertainty faded, disappeared
this pocket, in which you could stuff everything in the world, and the task suddenly became very small, simple and understandable.

    Maybe I'm even more or less sure about calculating the cost of the product, but the validation still worries me.
For some reason, I firmly believe that validation through "if else" is a bad practice and is not usually done this way, but I did not find another way.
    Another important condition at the end of the assignment is to make the project scalable, flexible, so that later you can add
another productFamily. I was thinking how to implement this, but I have no idea what this flexibility should looks like. Of the four
products formed two groups that I had to describe in different ways. Since the product will only appear in the future,
I cannot know how I should write the code to accept the future product. In my view, a scalable project,
this to which you can connect another new piece, like a puzzle, and then just as easily remove.
Whether to assume that the project should accept a new product without editing the ProductService class, or could
something else. Maybe I was having problems here, because I didn't know how to write the correct validation, or maybe just
I have no idea what the flexibility of the project should looks like.

