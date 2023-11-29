import kotlin.math.max

fun main() {
    //TODO Aufgabe 1: Variablen und Datentypen
    var myStore: String = "IT4all"
    var storeDescription: String = "Hardware und Software für Beruf und Alltag "
    var storeNumber: Double = 0049.13
    println("Bitte gib den Namen des Filial Leiters ein!")
    var storeManager = readln()
    println("Bitte gib das Alter des Filial Leiters ein!")
    var storeManagerAge = readln().toInt()
    var isDiscountAction: Boolean = true
    println("Der Name meines Ladens ist $myStore")
    println("Ich verkaufe $storeDescription")
    println("Die nummer meiner Filiale lautet: $storeNumber")
    println("Mein Filial Leiter heißt: $storeManager und ist $storeManagerAge Jahre alt!")
    println()
    println("___________________________________________________________________________")


    var inventar: MutableMap<String, Double> = mutableMapOf(
        "Mac Book " to 1500.00,
        "Logitech Maus" to 120.00,
        "USB Hub" to 15.00,
        "SSD Festplatte" to 100.00,
        "Wiso Steuersoftware" to 39.00
    )

    // Füge jetzt manuell, das heißt mit der richtigen Funktion/Syntax und nicht einfach, indem du die originale Map bearbeitest, folgendes hinzu:
    inventar.put("iPhone", 9999.99)
    inventar["Kaugummi"] = 2.49
    inventar.put("Smoothie", 4.99)
    println(inventar)
    inventar.put("iPhone", 1400.99)
    inventar["Smoothie"] = 2.99
    inventar.replace("SSD Festplatte", 150.00)
    println(inventar)
    inventar.remove("Smoothie")
    println(inventar)
    inventar.containsValue(1.49)
    println()
    println("Listen")
    var productList = mutableListOf(inventar.keys)
    println(productList)
    var productPrices = mutableListOf(inventar.values)
    println(productPrices)





    // verringere den Preis von 3 Produkten deiner Wahl um 1.50 Euro



    // Entferne das teuerste Produkt (du musst das Programm nicht rausfinden lassen, welches das teuerste ist, sondern kannst es selbst identifizieren)



    //5. Prüfe, ob das Produkt "Kaugummi" noch in der Map existiert und printe eine entsprechende Nachricht in die Konsole aus. Dafür brauchst du if else.


    //6. Prüfe, ob es ein Produkt mit dem Preis 1.49 in der Map gibt und drucke eine entsprechende Nachricht in der Konsole aus.


//    7. Listen anlegen: Lege jetzt jeweils eine Liste an mit
//       - allen Produkten
//       - allen Preisen


    // 8. Was ist eigentlich nochmal ein Set im Unterschied zu einer Liste/Map?




}

