package fr.test.controllers

&__[controller]__

class __[name]__Controller {
    #__[haveGetAll]__ {
        @Get
        public void GetAll__[name]__(){

        }
    }
    
    #__[haveGet]__ {
        @Get("/{id}")
        public void Get__[name]__(){

        }
    }

    #__[havePost]__ {
        @Post
        public void Create__[name]__(){

        }
    }

    #__[havePut]__ {
        @Put("/{id}")
        public void Update__[name]__(){

        }
    }

    #__[haveDelete]__ {
        @Delete("/{id}")
        public void Delete__[name]__(){

        }
    }
}