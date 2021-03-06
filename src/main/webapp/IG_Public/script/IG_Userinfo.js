 var vm;
      $(function(){	 
    	  initVue();
          vm.getJsonList();
          getClassName();
          getLevelName();
      });
      function getClassName(){
    		$.ajax({
    	        type: "post",
    	        url: "api/classify/getAll",
    	        dataType: "json",
    	        success: function(data){
    	        	console.log(data);
    	        	var list = data.data;
    	        	for(var i=0;i<list.length;i++){
    	        		$("#className").append("<option value='"+ list[i].id +"'>"+ list[i].name +"</option>");
    	        	}
    	         }

    	    });
    	}
      function getLevelName(){
  		$.ajax({
  	        type: "post",
  	        url: "api/level/getAll",
  	        dataType: "json",
  	        success: function(data){
  	        	console.log(data);
  	        	var list = data.data;
  	        	for(var i=0;i<list.length;i++){
  	        		$("#levelName").append("<option value='"+ list[i].id +"'>"+ list[i].name +"</option>");
  	        	}
  	         }

  	    });
  	}
      function initVue(){  
    		vm = new Vue({
    	        el: '#vueBox',
    	        data:function(){
    	        	
    	             return {
    	            	  modal:false,
    	              param: {
    	            	  id:"",
    	            	  page: 1,
    	                  rows: 10
    	                },
    	                username:"",
    	                password:"",
    	                realname:"", 
    	                email:"",
    	                classId:"",
    	                levelId:"",
    	                expericeId:"",
    	                educationId:"",
    	                priceId:"",
    	                abilityId:"",
    	                ageId:"",
    	                provinceCode:"",
    	                cityCode:"",
    	                areaCode:"",
    	                price:"", 
    	                cardNumber:"",
    	                phoneNumber:"",
    	                expericeList:[],
    	                educationList:[],
    	                abilityList:[],
    	                ageList:[],
    	                classList:[],
    	                priceList:[],
    	                levelList:[],
    	                provinceList:[],
    	                citiesList:[],
    	                countyList:[],
    	                detailModel:false,   	
    	                finishModel:false,
    	                detailform:{},
    	                total:0,
    	                columns1: [
               {
					type : 'index',
					title : '??????',
					align : 'center',
				 
				},
				            { title: '??????', key: 'username',align : 'center' },
                            { title: '??????',  key: 'password',align : 'center' },
                            { title: '????????????',  key: 'realname',align : 'center'},
                            { title: '??????',  key: 'photoUrl',render: function (h, params) {
                        		  return h('img',{
                        			 attrs: {
                        				 src:params.row.photoUrl
                        			 },
                        			 style:{
                        				 height:'100px',
                        				 width:'100px',
                        			 }
                        		  })	
                        	}},
                            { title: '??????',  key: 'email',align : 'center'},
                            { title: '??????',  key: 'type' ,align : 'center',
                            	render: function (h, params) {
                            		if(params.row.type=='0'){
        	                       		return  h('span', '?????????');
        	                       	}else if(params.row.type=='1'){
        	                       		return  h('span', '??????');
        	                       		
        	                       	}else if(params.row.type=='2'){
        	                       		return  h('span', '??????');
        	                       		
        	                       	}		
                            	}
                            },
                            
                            { title: '????????????',  key: 'createTime',align : 'center' },
                            { title: '??????',  key: 'isEnable',align : 'center',
    	                       	render: function (h, params) {
    	                       	if(params.row.isEnable=='0'){
    	                       		return  h('span', '?????????');
    	                       	}else if(params.row.isEnable=='1'){
    	                       		return  h('span', '?????????');
    	                       		
    	                       	}
    	                       	}
    	                       },
       	                    {
       	                        title: '??????',
       	                        key: 'action',
       	                        width: 310,
       	                        align: 'center',
       	                     render: function(h, params){
       	                    	var userType=$("#userType").val();
       	                 	var isEnable=params.row.isEnable;
       	                 if(userType==0&&params.row.isEnable=='0'&&params.row.type==1){
       	                     return h('div', [
	                                h('Button', {
	                                    props: {
	                                        type: 'primary',
	                                        size: 'small'
	                                    },
	                                    style: {
	                                        marginRight: '5px',
	                                    },
	                                    on: {
	                                        click:function(){
	                                        	vm.check(params.row);
	                                        }
	                                    }
	                                }, '??????'),
	                                h('Button', {
	                                    props: {
	                                        type: 'primary',
	                                        size: 'small'
	                                    },
	                                    style: {
	                                        marginRight: '5px',
	                                    },
	                                    on: {
	                                        click:function(){
	                                        	vm.tijiao(params.row);
	                                        }
	                                    }
	                                }, '??????'),
	                                h('Button', {
	                                    props: {
	                                        type: 'primary',
	                                        size: 'small'
	                                    },
	                                    style: {
	                                        marginRight: '5px',
	                                    },
	                                    on: {
	                                        click:function(){
	                                        	vm.wanshan(params.row);
	                                        }
	                                    }
	                                }, '????????????'),
	                                h('Button', {
	                                    props: {
	                                        type: 'primary',
	                                        size: 'small'
	                                    },
	                                    style: {
	                                        marginRight: '5px',
	                                    },
	                                    on: {
	                                        click:function(){
	                                        	vm.deleteRow(params.row);
	                                        }
	                                    }
	                                }, '??????'),
	                                
	                           
	                                ])
	                          
	                                
       	                 }else if(userType==0&&params.row.isEnable=='0'&&params.row.type!=1){
       	                  return h('div', [
                              h('Button', {
                                  props: {
                                      type: 'primary',
                                      size: 'small'
                                  },
                                  style: {
                                      marginRight: '5px',
                                  },
                                  on: {
                                      click:function(){
                                      	vm.check(params.row);
                                      }
                                  }
                              }, '??????'),
                              h('Button', {
                                  props: {
                                      type: 'primary',
                                      size: 'small'
                                  },
                                  style: {
                                      marginRight: '5px',
                                  },
                                  on: {
                                      click:function(){
                                      	vm.tijiao(params.row);
                                      }
                                  }
                              }, '??????'),
                  
                              h('Button', {
                                  props: {
                                      type: 'primary',
                                      size: 'small'
                                  },
                                  style: {
                                      marginRight: '5px',
                                  },
                                  on: {
                                      click:function(){
                                      	vm.deleteRow(params.row);
                                      }
                                  }
                              }, '??????'),
                              
                         
                              ])
       	                 }else if(userType==0&&params.row.isEnable=='1'&&params.row.type!=1){
       	             	 return h('div', [
       	                	 h('Button', {
                                 props: {
                                     type: 'primary',
                                     size: 'small'
                                 },
                                 style: {
                                     marginRight: '5px',
                                 },
                                 on: {
                                     click:function(){
                                     	vm.black(params.row);
                                     }
                                 }
                             }, '??????'),
                             h('Button', {
                                 props: {
                                     type: 'primary',
                                     size: 'small'
                                 },
                                 style: {
                                     marginRight: '5px',
                                 },
                                 on: {
                                     click:function(){
                                     	vm.tijiao(params.row);
                                     }
                                 }
                             }, '??????'),
                       
                             h('Button', {
                                 props: {
                                     type: 'primary',
                                     size: 'small'
                                 },
                                 style: {
                                     marginRight: '5px',
                                 },
                                 on: {
                                     click:function(){
                                     	vm.deleteRow(params.row);
                                     }
                                 }
                             }, '??????'),
                           
                             ])	
           	                 }else if(userType==0&&params.row.isEnable=='1'&&params.row.type==1){
       	                	 return h('div', [
       	                	 h('Button', {
                                 props: {
                                     type: 'primary',
                                     size: 'small'
                                 },
                                 style: {
                                     marginRight: '5px',
                                 },
                                 on: {
                                     click:function(){
                                     	vm.black(params.row);
                                     }
                                 }
                             }, '??????'),
                             h('Button', {
                                 props: {
                                     type: 'primary',
                                     size: 'small'
                                 },
                                 style: {
                                     marginRight: '5px',
                                 },
                                 on: {
                                     click:function(){
                                     	vm.tijiao(params.row);
                                     }
                                 }
                             }, '??????'),
                             h('Button', {
                                 props: {
                                     type: 'primary',
                                     size: 'small'
                                 },
                                 style: {
                                     marginRight: '5px',
                                 },
                                 on: {
                                     click:function(){
                                     	vm.wanshan(params.row);
                                     }
                                 }
                             }, '????????????'),
                             h('Button', {
                                 props: {
                                     type: 'primary',
                                     size: 'small'
                                 },
                                 style: {
                                     marginRight: '5px',
                                 },
                                 on: {
                                     click:function(){
                                     	vm.deleteRow(params.row);
                                     }
                                 }
                             }, '??????'),
                           
                            	
                           
                            
                             ])	 
       	                 }else if(userType==1) {
       	                  return h('div', [
       	                	 h('Button', {
                                 props: {
                                     type: 'primary',
                                     size: 'small'
                                 },
                                 style: {
                                     marginRight: '5px',
                                 },
                                 on: {
                                     click:function(){
                                     	vm.tijiao(params.row);
                                     }
                                 }
                             }, '??????'),
                             h('Button', {
                                 props: {
                                     type: 'primary',
                                     size: 'small'
                                 },
                                 style: {
                                     marginRight: '5px',
                                 },
                                 on: {
                                     click:function(){
                                     	vm.wanshan(params.row);
                                     }
                                 }
                             }, '????????????'),
                             ])
       	                 }else if(userType==2){
       	                	return h('div', [
          	                	 h('Button', {
                                    props: {
                                        type: 'primary',
                                        size: 'small'
                                    },
                                    style: {
                                        marginRight: '5px',
                                    },
                                    on: {
                                        click:function(){
                                        	vm.tijiao(params.row);
                                        }
                                    }
                                }, '??????'),   
                                h('Button', {
                                    props: {
                                        type: 'primary',
                                        size: 'small'
                                    },
                                    style: {
                                        marginRight: '5px',
                                    },
                                    on: {
                                        click:function(){
                                        	vm.wanshan(params.row);
                                        }
                                    }
                                }, '????????????'),
                                ]) 
       	                 }
       	                     }
       	                     
       	                    },
    	                ],
    	           
    	               data1:[],
    	               formValidate: {
    	                  
    	                },
    	                value:''
    	                
    	            }
    	        },
    	        created:function(){
    	        	this.getProvinceList();
    	        	this.getClassList();
    	        	this.getLevelList();
    	        	this.getEducationList();
    	        	this.getAbilityList();
    	        	this.getExpericeList();
    	        	this.getPriceList();
    	        	this.getAgeList();
    	        },
    	        
    	        methods:{
    	        	
    	        	addModel:function(){
    	        		this.modal=true;
    	        	},
    	            changePageNum: function (pageNum) {
    	              this.param.page = pageNum;
    	              this.getJsonList();
    	            },
    	            handleReachBottom:function() {
    	                return new Promise(function resolve(i){
    	                    setTimeout(function() {
    	                        const last = this.list1[this.list1.length - 1];
    	                        for (var i = 1; i < 11; i++) {
    	                            this.list1.push(last + i);
    	                        }
    	                        resolve();
    	                    }, 2000);
    	                });
    	            },
    	          search:function(){
          	        	   this.param.page = 1;
        	        	   this.getJsonList();
        	       },
        	    
        	     deleteRow:function(row){
	       	          	 this.$Modal.confirm({
	     	                    title: '?????????',
	     	                    content: '<p>??????????????????</p>',
	     	                    onOk:function(){
	     	                    	$.ajax({
	     	    	                    type:"post",
	     	    	                    url:"api/user/deleteUser",
	     	    	                    data:{"id":row.id},
	     	    	                    dataType:'json',
	     	    	                    async:false,
	     	    	                    success : function(data) {  
	     	    	                    	if(data.resultCode=='200'){
	     	    	                    		layer.msg('????????????!');
    	     	    	                   		vm.getJsonList();
	     	    	                   	}else{
	     	    	                   		
	     	    	                   		 layer.msg(data.resultDesc);
	     	    	                   	}
	     	    	                     
	     	    	                    },
	     	    	                   error :function() {
	     	    	                	   layer.msg('???????????????');
	     	    	                    }
	     	    	              	 });
	     	                    	
	     	                    }});
	     	        },
	     	        check:function(row){
	     	        	this.$Modal.confirm({
     	                    title: '?????????',
     	                    content: '<p>??????????????????</p>',
     	                    onOk:function(){
     	                    	$.ajax({
     	    	                    type:"post",
     	    	                    url:"api/user/updateselective",
     	    	                    data:{"id":row.id,'isEnable':'1'},
     	    	                    dataType:'json',
     	    	                    async:false,
     	    	                    success : function(data) {  
     	    	                    	if(data.resultCode=='200'){
     	    	                    		layer.msg('????????????!');
	     	    	                   		vm.getJsonList();
     	    	                   	}else{
     	    	                   		
     	    	                   		 layer.msg(data.resultDesc);
     	    	                   	}
     	    	                     
     	    	                    },
     	    	                   error :function() {
     	    	                	   layer.msg('???????????????');
     	    	                    }
     	    	              	 });
     	                    	
     	                    }});
	     	        
	     	        },
	     	     
	     	       
	     	        black:function(row){
	     	        	this.$Modal.confirm({
     	                    title: '?????????',
     	                    content: '<p>??????????????????</p>',
     	                    onOk:function(){
     	                    	$.ajax({
     	    	                    type:"post",
     	    	                    url:"api/user/updateselective",
     	    	                    data:{"id":row.id,'isEnable':'0'},
     	    	                    dataType:'json',
     	    	                    async:false,
     	    	                    success : function(data) {  
     	    	                    	if(data.resultCode=='200'){
     	    	                    		layer.msg('????????????!');
	     	    	                   		vm.getJsonList();
     	    	                   	}else{
     	    	                   		
     	    	                   		 layer.msg(data.resultDesc);
     	    	                   	}
     	    	                     
     	    	                    },
     	    	                   error :function() {
     	    	                	   layer.msg('???????????????');
     	    	                    }
     	    	              	 });
     	                    	
     	                    }});
	     	        },

    	            changeProvince:function(){
    	            	if(this.provinceCode){
    	    	        	this.getCityList(this.provinceCode);
    	            	}
    	            },
    	            changeCity:function(){
    	            	if(this.cityCode){
    	            		this.getCountyList(this.cityCode);	
    	            	}
	    	        	
	    	        	
	            },
	     	    	wanshan:function(row){
	       	     	vm.detailform={};
	       	       this.detailform.id=row.id;
	       	    var abilityId=row.abilityId;
	       	    if(abilityId){
	       	    	this.cardNumber=row.cardNumber;
	       	    	this.phoneNumber=row.phoneNumber;
	       	    	this.abilityId=row.abilityId;
	       	     this.priceId=row.priceId;
		       	    this.ageId=row.ageId;
		       	    this.educationId=row.educationId;
		       	   this.classId=row.classId;
		       	 this.expericeId=row.expericeId;
		       	     this.levelId=row.levelId;
		       	  this.provinceCode=row.provinceCode;
		       	  this.cityCode=row.cityCode;
		       	this.areaCode=row.countyCode;
		       	 document.getElementById("img").src=row.photoUrl
		       	 $("#article").css("display","block");
	       	    }
	       	   
	       	this.finishModel=true;
	       	     	},
	        	    tijiao:function(row){
	
	        	    	vm.detailform={};
	       	     	       this.detailform.id=row.id;
	       	     		  this.detailform.username=row.username;
    	     			     this.detailform.password=row.password;	       	     		   
    	     		         this.detailform.realname=row.realname;
    	     		         this.detailform.email=row.email;
    	     		        $("#type").val(row.type);
   	       	     		   this.detailModel=true;
	       	     	   },
	       	    
	       	     getProvinceList:function(){
	   	            	$.ajax({
	     	                  type:"post",
	     	                  url:"api/area/getProvince",
	     	                  data:{},
	     	                  dataType:'json',
	     	                  async:true,
	     	                  success : function(response) {    	                	  
	     	                	  if(response.resultCode == '200'){
					        		  vm.provinceList = response.data;
					        	  } 
	     	                  },
	     	                 error :function() {
	     	                	 alert("????????????");
	     	                  }
	     	            	 });	
	   	            	
	   	            },
    	            getCityList:function(param){
    	            	$.ajax({
      	                  type:"post",
      	                  url:"api/area/getCity",
      	                  data:{provinceCode:param},
      	                  dataType:'json',
      	                  async:true,
      	                  success : function(response) {    	                	  
      	                	  if(response.resultCode == '200'){
				        		  vm.citiesList = response.data;
				        	  } 
      	                  },
      	                 error :function() {
      	                	 alert("????????????");
      	                  }
      	            	 });	
    	            	
    	            },
    	            getCountyList:function(param){
    	            	$.ajax({
      	                  type:"post",
      	                  url:"api/area/getCounty",
      	                  data:{cityCode:param},
      	                  dataType:'json',
      	                  async:true,
      	                  success : function(response) {    	                	  
      	                	  if(response.resultCode == '200'){
				        		  vm.countyList = response.data;
				        	  } 
      	                  },
      	                 error :function() {
      	                	 alert("????????????");
      	                  }
      	            	 });	
    	            	
    	            },
    	            getClassList:function(){
    	            	$.ajax({
      	                  type:"post",
      	                  url:"api/classify/getAll",
      	                  data:{},
      	                  dataType:'json',
      	                  async:true,
      	                  success : function(response) {    	                	  
      	                	  if(response.resultCode == '200'){
				        		  vm.classList = response.data;
				        	  } 
      	                  },
      	                 error :function() {
      	                	 alert("????????????");
      	                  }
      	            	 });	
    	            	
    	            },
    	            getLevelList:function(){
    	            	$.ajax({
      	                  type:"post",
      	                  url:"api/level/getAll",
      	                  data:{},
      	                  dataType:'json',
      	                  async:true,
      	                  success : function(response) {    	                	  
      	                	  if(response.resultCode == '200'){
				        		  vm.levelList = response.data;
				        	  } 
      	                  },
      	                 error :function() {
      	                	 alert("????????????");
      	                  }
      	            	 });	
    	            	
    	            },
    	            getAgeList:function(){
    	            	$.ajax({
      	                  type:"post",
      	                  url:"api/dictionary/getDictionary",
      	                  data:{parentCode:"age"},
      	                  dataType:'json',
      	                  async:true,
      	                  success : function(response) {    	                	  
      	                	  if(response.resultCode == '200'){
				        		  vm.ageList = response.data;
				        	  } 
      	                  },
      	                 error :function() {
      	                	 alert("????????????");
      	                  }
      	            	 });	
    	            	
    	            },
    	            getAbilityList:function(){
    	            	$.ajax({
      	                  type:"post",
      	                  url:"api/dictionary/getDictionary",
      	                  data:{parentCode:"ability"},
      	                  dataType:'json',
      	                  async:true,
      	                  success : function(response) {    	                	  
      	                	  if(response.resultCode == '200'){
				        		  vm.abilityList = response.data;
				        	  } 
      	                  },
      	                 error :function() {
      	                	 alert("????????????");
      	                  }
      	            	 });	
    	            	
    	            },
    	            getEducationList:function(){
    	            	$.ajax({
      	                  type:"post",
      	                  url:"api/dictionary/getDictionary",
      	                  data:{parentCode:"education"},
      	                  dataType:'json',
      	                  async:true,
      	                  success : function(response) {    	                	  
      	                	  if(response.resultCode == '200'){
				        		  vm.educationList = response.data;
				        	  } 
      	                  },
      	                 error :function() {
      	                	 alert("????????????");
      	                  }
      	            	 });	
    	            	
    	            },
    	            getExpericeList:function(){
    	            	$.ajax({
      	                  type:"post",
      	                  url:"api/dictionary/getDictionary",
      	                  data:{parentCode:"experice"},
      	                  dataType:'json',
      	                  async:true,
      	                  success : function(response) {    	                	  
      	                	  if(response.resultCode == '200'){
				        		  vm.expericeList = response.data;
				        	  } 
      	                  },
      	                 error :function() {
      	                	 alert("????????????");
      	                  }
      	            	 });	
    	            	
    	            },
    	            getPriceList:function(){
    	            	$.ajax({
      	                  type:"post",
      	                  url:"api/dictionary/getDictionary",
      	                  data:{parentCode:"price"},
      	                  dataType:'json',
      	                  async:true,
      	                  success : function(response) {    	                	  
      	                	  if(response.resultCode == '200'){
				        		  vm.priceList = response.data;
				        	  } 
      	                  },
      	                 error :function() {
      	                	 alert("????????????");
      	                  }
      	            	 });	
    	            	
    	            },
    	          
    	           getJsonList:function(){
    	        	   var load=this.$Loading;
    	        	   load.start();
    	        	   var index = layer.load(0, {shade: false}); 
    	        	  var userType=$("#userType").val();
   	        	     var id=$("#userId").val();
   	        	   if(userType!=0){
   	        		   this.param.id=id;
   	        	   }
    	        	   var Data = this.param;
    	            	$.ajax({
    	                  type:"post",
    	                  url:"api/user/getUserList",
    	                  data:Data,
    	                  dataType:'json',
    	                  async:false,
    	                  success : function(data) {  
    	                	console.log(data.data.result);
    	                   vm.data1 = data.data.result;
    	                   vm.total = data.data.total;
    	                   load.finish();
    	                   layer.close(index);
    	                  },
    	                 error :function() {
    	                	 load.error();
    	                	 alert("????????????");
    	                  }
    	            	 });
    	            },
    	            
       	     	   save:function(row){
       	     		var load=this.$Loading;
 	        	      load.start();   
 	        	      this.detailform.type=$("#usertype option:selected").val();
       	          	$.ajax({
       	              type:"post",
       	              url:"api/user/addUser",
       	              data:this.detailform,
       	              dataType:'json',
       	             success : function(data) {  
       	              	if(data.resultCode=='200'){
       	               		 layer.msg(data.resultDesc);
       	               		 vm.getJsonList();
       	               	     vm.detailModel=false; 
       	               	     
       	               	}else{
       	               		 layer.msg(data.resultDesc);
       	               	}
       	              },
       	             error :function() {
       	            	 alert('?????????????????????');
       	              }
       	        	 });
                
    	     	    },
    	     	   savefinish:function(row){
     	     		  formData=new FormData();
        	  	       var file=document.getElementById("FileUpload").files[0];
        	  	       var id=this.detailform.id;
        	  	       var phoneNumber=this.phoneNumber;
        	  	       var cardNumber=this.cardNumber;
        	  	       var abilityId=this.abilityId;
        	  	      var priceId=this.priceId;
        	  	      var ageId=this.ageId;
        	  	      var educationId=this.educationId;  	 
        	  	      var classId=this.classId;
        	  	     var levelId=this.levelId;
        	  	     var provinceCode=this.provinceCode;
        	  	     var cityCode=this.cityCode;
        	  	     var areaCode=this.areaCode;
        	  	     var expericeId=this.expericeId;
        	  	     if(file){
        	  	    	formData.append("file",file);
         	  	       formData.append("userId",this.detailform.id);
         	  	       $.ajax({
         	  	    	   type:"post",
         	  	    	   url:'file/uploadFile',
         	  	    	   data:formData,
         	  	    	 async:false,
         	 		     cache:false,
         	 		    processData:false,
         	 		    contentType:false,
         	 		    success:function(data){
         	 		    	if(data.errno==0){
         	 		    	  var param={
         	 		    			 id:id,
         	 		    			abilityId:abilityId,
         	 		    			priceId:priceId,
         	 		    			ageId:ageId,
         	 		    			educationId:educationId,
         	 		    			classId:classId,
         	 		    			levelId:levelId,
         	 		    			provinceCode:provinceCode,
         	 		    			cityCode:cityCode,
         	 		    			countyCode:areaCode,
         	 		    			expericeId:expericeId,
         	 		    			cardNumber:cardNumber,
         	 		    	        phoneNumber:phoneNumber,
         	 		    			photoUrl:data.data[0],
            	     		    }	
         	 		    	 	$.ajax({
         	         	              type:"post",
         	         	              url:"api/user/addUser",
         	         	              data:param,
         	         	             async:false,
         	         	              dataType:'json',
         	         	             success : function(data) {  
         	         	              	if(data.resultCode=='200'){
         	         	               		 layer.msg("????????????");
         	         	               		 vm.getJsonList();
         	         	               	     vm.finishModel=false; 
         	         	               	     
         	         	               	}else{
         	         	               		 layer.msg(data.resultDesc);
         	         	                  	
         	         	               	}
         	         	              },
         	         	             error :function() {
         	         	            	 alert('?????????????????????');
         	         	            	
         	         	              }
         	         	        	 });
         	 		    	}
         	 		    	
         	 		    }
         	 		    
         	 		    
         	  	       }) 
        	  	     }else{
        	  	    	  var param={
      	 		    			 id:id,
      	 		    			abilityId:abilityId,
      	 		    			priceId:priceId,
      	 		    			ageId:ageId,
      	 		    			educationId:educationId,
      	 		    			classId:classId,
      	 		    			levelId:levelId,
      	 		    			provinceCode:provinceCode,
      	 		    			cityCode:cityCode,
      	 		    			phoneNumber:phoneNumber,
      	 		    			cardNumber:cardNumber,
      	 		    			countyCode:areaCode,
      	 		    			expericeId:expericeId,
         	     		    }	
      	 		    	 	$.ajax({
      	         	              type:"post",
      	         	              url:"api/user/addUser",
      	         	              data:param,
      	         	             async:false,
      	         	              dataType:'json',
      	         	             success : function(data) {  
      	         	              	if(data.resultCode=='200'){
      	         	               		 layer.msg(data.resultDesc);
      	         	               		 vm.getJsonList();
      	         	               	vm.finishModel=false; 
      	         	               	     
      	         	               	}else{
      	         	               		 layer.msg(data.resultDesc);
      	         	               	}
      	         	              },
      	         	             error :function() {
      	         	            	 alert('?????????????????????');
      	         	              }
      	         	        	 }); 
        	  	     }
        	  	        
           	     		
     	     	   }
       	     
    	     	   
    	        },
    	    });
    	}

      function add(){
    	  vm.detailform={};
    	  vm.detailModel=true; 
  
       }
       
      function search(){
    	  vm.param.classId=$("#className option:selected").val();
    	  vm.param.levelId=$("#levelName option:selected").val();
    	  vm.param.type=$("#type option:selected").val();
    	  vm.getJsonList();
    	  
      }
      function saveinfo(){
    	  if(!vm.detailform.username){
   			   layer.msg("??????????????????")
   			   return false;
   		   }
   		  if(!vm.detailform.password){
  			   layer.msg("??????????????????")
  			   return false;
  		   }
   	  if(!vm.detailform.realname){
			   layer.msg("????????????????????????")
			   return false;
		   }
   	  if(!$("#usertype option:selected").val()){
		   layer.msg("??????????????????")
		   return false;
	   }
   	if(!vm.detailform.email){
		   layer.msg("??????????????????")
		   return false;
	   }
    	 vm.save(); 
      }
      
      function savefinishinfo(){
    	  vm.savefinish();
      }
   
      function previewimage(){
    		var reader =new FileReader();
    		var file=document.getElementById("FileUpload").files[0];
    		reader.readAsDataURL(file);
    		reader.onload=function(){
    			document.getElementById("img").src=this.result;
    	         $("#article").css("display","block");
    		}

    	}
      function uploadImg(){
    		$("#FileUpload").click();
    	}
        	 
