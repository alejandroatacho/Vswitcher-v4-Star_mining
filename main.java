if (!v.getLocalPlayer().hasAnimation(6746) && !v.getWalking().isMoving() &&
    (v.getWalking().nearEntity(Entity.GAME, 41220, 5) || 
     v.getWalking().nearEntity(Entity.GAME, 41221, 5) || 
     v.getWalking().nearEntity(Entity.GAME, 41222, 5) || 
     v.getWalking().nearEntity(Entity.GAME, 41223, 5) || 
     v.getWalking().nearEntity(Entity.GAME, 41224, 5) ||
     v.getWalking().nearEntity(Entity.GAME, 41225, 5) || 
     v.getWalking().nearEntity(Entity.GAME, 41226, 5) || 
     v.getWalking().nearEntity(Entity.GAME, 41227, 5) || 
     v.getWalking().nearEntity(Entity.GAME, 41228, 5) || 
     v.getWalking().nearEntity(Entity.GAME, 41229, 5))) {
     v.getMining().mine(41220, 41221, 41222, 41223, 41224, 41225, 41226, 41227, 41228, 41229);
}
