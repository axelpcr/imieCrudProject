# imieCrudProject

Ce projet est un crud permettant la gestion de facture et de commande.

# Lirairie utilisée

Joda date time pour les dates.

# Génération des réferences

Pour la génération des références pour les entités Invoice, Order and Delivery, une méthode a été crée.
Les reférences auront cette forme :

    Delivery : DEL + 2016 + 1468096562810 = suffix + years + date en milliseconde.
    Order    : ORD + 2016 + 1468096626099 = suffix + years + date en milliseconde.
    Invoice :  INV + 2016 + 1468096676266 + 24 = suffix + years + date en milliseconde + id max de la table Invoice,
    cela permet aux factures, d'avoir une référence qui ce suit.
    
    Un front end angular est à venir.

