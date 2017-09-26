class App { 
    constructor() { 
        this.printerInput = document.querySelector("#printer");
        this.output = document.querySelector("#output");
        this.click = document.querySelector("#click");
        this.printerInput.onkeydown = (e) => this.output.innerText = e.target.value;
        this.click.onclick = () => this.addEventListener();
    }

    addEventListener() { 
        fetch('http://localhost:8282/print/resources/printers').
            then(response => response.json()).then(o => this.addPrinters(o));
    }

    addPrinters(array) { 
        console.log(array);
        array.map(p => p.name).forEach(a => this.div(a));
        
    }

    div(content) { 
        const div = document.createElement("div");
        div.innerText = content;
        this.output.appendChild(div);
    }

}


new App();