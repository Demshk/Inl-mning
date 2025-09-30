# Inl-mning
Syftet med mitt program är att kryptera och sedan dekrypta en string med hjälp av något som kallas för ett ceasar cipher. Programet börjar med att ta 2 olika input från användaren

1: En int, denna int bestämmer hur många steg bokstäverna ska förflyttas i ciphern (offset). 
2: En string som är meddelandet som ska krypteras. 

Efter att inputen skickats in i programmet skickas meddelandet till SuperEncrypt1 för att konvertera alla stora bokstäver till små, detta görs för att underlätta för logiken då den föredrar att ha alla bokstäver i samma form. Nu skickas meddelandet till SubEncrypt där själva krypteringen och dekrypteringen händer. Här ittererar koden över varje bokstav en och en och flyttar dom enlingt int vi skrev i början av programmet. För att dekryptera så reversar programmet bara exakt det den gjorde för att kryptera meddelandet, alltså flyttar den tilbaka varje bokstav X antal steg. Programmet skriver sen ut både de krypterade och de dekrypterade meddelandet i en csv fil, i terminalen ser man ett kort bekräftelse meddelande.

I mitt program använder jag mig enbart utav java.util.Scanner för att kunna ta input från användaren via terminalen och java.io.FileWriter för att kunna skriva ut resultatet i en csv fil.

Det som gick bra är att programmet gör precis det som är menat att den ska göra, kryptera och dekryptera ett meddelande. Jag tycker att jag följt clean code principen bra då allt är uppdelat i var sin klass och allt förs samman snyggt på slutet. Jag tycker också koden är tydlig och man ser klart vad allt gör och hur det är uppdelat. Jag ser även ställen där jag hade kunnat förbättra koden! Jag hade kunnat göra en simpel if else sats för att kontrollera så att användaren matar in en int och inte något annat när man programmet frågar efter offset. Jag hade även kunnat göra programmet mycket snyggare genom att använda någon typ av GUI. Det hade även varit coolt om man till exempel hade varit tvungen att skriva in ett lösenord eller liknande för att dekryptera meddelandet. 

