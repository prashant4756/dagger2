package com.hariofspades.dagger2advanced.component;

import com.hariofspades.dagger2advanced.interfaces.RandomUsersApi;
import com.hariofspades.dagger2advanced.modules.PicassoModule;
import com.hariofspades.dagger2advanced.modules.RandomUsersModule;
import com.squareup.picasso.Picasso;

import dagger.Component;

@Component(modules = {RandomUsersModule.class, PicassoModule.class})
public interface RandomUserComponent {

    //these 2 mothods will be implemented by dagger on compilation
    //need to write modules name with component above once created to connect this component with modules
    RandomUsersApi getRandomUserService();
    Picasso getPicasso();


    //now create modules to get the underhood dependencies for RandomUserApi and Picasso
}
