# Sygns Java Task #

Vladyslav Romanovskyi

sygns.com

### Sygns store ###

In our online shop we have four products: Neons, Letters, LED and Lightboxes. We want to validate orders from our configurator and calculate prices based on the product parameters. In the configurator, users can change the size, content, and color of the product. Each product has assigned a size, user content, color of the illumination, and mounting type. Also we have object-type data stored in the attribute named 'productFamily', which is assigned to every product. For the LED there will be an additional RGB color option, that is not available for the neons.

Create Spring Boot application which will get data from front-end app, validate users' designs and then calculate the price for each product. Assume that we are going to add new product families next month so, your solution should be flexible and allow it.