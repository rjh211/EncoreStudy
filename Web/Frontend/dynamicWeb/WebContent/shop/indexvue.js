new Vue({
	el:"#top", 
	data:{
		id:'',
		pwd:'',
		logstat:true,
		logtypei:'',
		logtypes:'',
		title:'',
		lst : [],
		join : 'join.html'
	},
	created: function() {
		this.id = sessionStorage.getItem("id");
		if(this.id!=null){
			this.logstat=false;
			this.logtypei = sessionStorage.getItem("typei");
			this.logtypes = sessionStorage.getItem("types");
		}
	},
	methods:{
		login:function(){
			axios.get('http://localhost:8888/members',{params:{'id':this.id, 'pwd':this.pwd}})
			.then(res=>{
				if(res.data.result){
					this.logstat=false;
					sessionStorage.setItem("id", this.id);
					sessionStorage.setItem("typei", res.data.typei);
					sessionStorage.setItem("types", res.data.types);
					this.logtypei = res.data.typei;
					this.logtypes = res.data.types;
					if(this.logtypei=='0'){
						this.title='모든 상품 목록';
						this.my_list();
					}else{
						this.title='내 상품 목록';
						this.all_list();
					}
				}
			});
		},
		logout:function(){
			sessionStorage.clear();
			this.id='';
			this.pwd='';
			this.logstat=true;
			this.logtypei='';
			this.logtypes='';
			this.lst = [];
		},
		my_list:function(){
			axios.get('http://localhost:8888/products').then((res)=>{
				this.lst.push(res.data);
			})
		},
		all_list:function(){
			axios.get('http://localhost:8888/products/itemby/'+this.id).then(res=>{
				this.lst.push(res.data);
			})
		}
	},
	destroyed : function(){
		console.log('destroyed')
		sessionStorage.clear()
	}
});
