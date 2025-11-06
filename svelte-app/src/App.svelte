<script>
	import Hijo from './Hijo.svelte'
	export let name;
	export let nombre;

	let contador =0;
	function incrementar(){
		contador = contador + 1;

	}

	
	function saludar() {
    alert(nombre ? nombre : "valor nulo");
	}

</script>

<main>
	<h1>Pajaro {name}!</h1>

	<h1>Contar: {contador}</h1>
	<button on:click={incrementar}>Contar++</button>
	<Hijo texto="Guardar" color='green'></Hijo>
	<Hijo texto="Borrar" color='red'></Hijo>
	<button on:click={saludar} >Saludarme</button>
	<input bind:value={nombre} placeholder="Escribe tu nombre">
	<p>Hola {nombre}</p>
	<p>Visit the <a href="https://svelte.dev/tutorial">Svelte tutorial</a> to learn how to build Svelte apps.</p>
	
</main>

<style>
	main {
		text-align: center;
		padding: 1em;
		max-width: 240px;
		margin: 0 auto;
	}

	h1 {
		color: #ff3e00;
		text-transform: uppercase;
		font-size: 4em;
		font-weight: 100;
	}

	@media (min-width: 640px) {
		main {
			max-width: none;
		}
	}
</style>