package de.kryptondev.spacy.helper;

import com.esotericsoftware.kryo.Kryo;
import de.kryptondev.spacy.data.*;
import de.kryptondev.spacy.share.*;
import de.kryptondev.spacy.share.playerEvents.*;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.newdawn.slick.geom.Vector2f;


public class KryoRegisterer {
    public static void registerAll(Kryo k){     
        k.register(DebugTickDelta.class);
        
        k.register(Object.class);
        k.register(boolean.class);  
        k.register(float.class);
        k.register(long.class);
        k.register(int.class);
        k.register(byte[].class);
        k.register(float[].class);
        k.register(String.class);
        k.register(Date.class);
        k.register(HashMap.class); 
        k.register(ConcurrentHashMap.class);
        k.register(java.util.ArrayList.class);
        k.register(CopyOnWriteArrayList.class);
        k.register(EMoving.class);
        
        k.register(ChunkedEntity.class);        
        k.register(ChunkedShip.class);        
        k.register(ChunkedProjectiles.class);        

        k.register(Rect.class);
        k.register(Vector2f.class);         
        
        k.register(Chatmessage.class);        
        k.register(ConnectionAttemptResponse.class);        
        k.register(ConnectionAttemptResponse.Type.class);
        k.register(ConnectionInfo.class);
        k.register(PlayerInfo.class);
        k.register(Version.class);  
        k.register(World.class);  
        k.register(Entity.class);  
        k.register(Weapon.class);    
        k.register(Ship.class);  
        k.register(Projectile.class);  
        k.register(Shield.class);
        k.register(DamageType.class);
        k.register(PlayerRotate.class);        
        k.register(Move.class);
        k.register(DeleteEntity.class);
        k.register(UpdateLife.class);
        
        k.register(OnDeath.class);
        k.register(OnHit.class);
        k.register(OnKill.class);
        k.register(OnJoin.class);
    }
}
