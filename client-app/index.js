fetch('http://localhost:8080/api/products')
.then(response=>response.json())
.then(categories=>{
    console.log(categories);
})

