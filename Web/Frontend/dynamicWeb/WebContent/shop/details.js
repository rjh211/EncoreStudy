/**
 * 
 */

new Vue({
	el : "#info",
	data:{
		p : null,
		id : '',
		typei : '',
	},
	methods:{
		
	},
	created : ()=>{
		this.p = sessionStorage.getItem("p");
		sessionStorage.removeItem("p");
		this.id = sessionStorage.getItem("id");
		sessionStorage.removeItem("id");
		this.typei = sessionStorage.getItem("typei");
		sessionStorage.removeItem("typei");
	}
})