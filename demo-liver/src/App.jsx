import { useState } from 'react'
import './App.css'

function App() {
  const [count, setCount] = useState(0)

  const submitFolio = () => {
    const folioNum = document.getElementById("folio").value
    fetch("http://localhost:8080/misFolios", {
      method: "POST",
      body: JSON.stringify({
        "folioNum":folioNum
      }),
      headers: {
        "Content-type": "application/json; charset=UTF-8",
       
      },
      referrerPolicy:"unsafe-url"
    })
      .then((response) => response.json())
      .then((json) => alert(json.concatValue));
    
  }

  

  return (
    <>
      <h1>Crea tu folio</h1>
      <input type="text" id="folio" ></input>
      <div className="card">
        <button onClick={submitFolio}>
          Enviar numero de folio
        </button>
      </div>

    </>
  )
}


export default App
