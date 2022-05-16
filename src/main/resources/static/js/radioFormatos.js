/**
 * 
 */
function getTHFormato() {
	fetch('http://localhost:8080/thformato')
		.then(response => response.json())
		.then(data => {
			document.getElementById('beneficio').value = data.beneficio;
			document.getElementById('beneficio').innerHTML = data.beneficio;
			document.getElementById('beneficio').innerText = data.beneficio;
		});

}

function getSKFormato() {
	fetch('http://localhost:8080/skformato')
		.then(response => response.json())
		.then(data => {
			document.getElementById('beneficio').value = data.beneficio;
			document.getElementById('beneficio').innerHTML = data.beneficio;
			document.getElementById('beneficio').innerText = data.beneficio;
		});
}


