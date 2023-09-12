const fun = (name, callback) => {
    if(name === "Rahul")
     return callback('Rahut name is denied!', null)
    callback(null, name)
}

fun("Rahul 2", (err, data) => {
    try {
        if(err) throw new Error(err)
         console.log(data)
    } catch (error) {
        console.log(error)
    }
    
})