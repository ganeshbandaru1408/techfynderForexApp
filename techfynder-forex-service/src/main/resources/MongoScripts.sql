db.getCollection('Exchange_Value').find({})

db.getCollection('Exchange_Value').insertMany([
     { currencyFrom: "USD", currencyTo: 'INR', conversionMultiple: 65 }, 
     { currencyFrom: "EUR", currencyTo: 'INR', conversionMultiple: 75 }, 
     { currencyFrom: "AUD", currencyTo: 'INR', conversionMultiple: 25 }, 
])
