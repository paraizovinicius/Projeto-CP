package Main;

import Entity.Player;

public class CollisionChecker {

    GamePanel gp;

    public CollisionChecker(GamePanel gp){
        this.gp = gp;
    }

    public void checkTile(Player player){

        // Armazenaremos todos os pontos da nossa playerHitBox em variáveis
        int leftX = player.playerHitbox.x;
        int rightX = player.playerHitbox.x + player.playerHitbox.width;
        int topY = player.playerHitbox.y;
        int bottomY = player.playerHitbox.y + player.playerHitbox.height;

        int topRow = topY / gp.tileSize; // pode dar um número quebrado, o que diz que o player está em dois tiles ao mesmo tempo
        int leftCol = leftX / gp.tileSize;
        int bottomRow = bottomY / gp.tileSize;
        int rightCol = rightX / gp.tileSize;

        int tileNum1, tileNum2;

        switch (player.direction) {
            case "norte":
                topRow = (topY - player.playerSpeed+3) / gp.tileSize;
                tileNum1 = gp.tileManager.mapTileNum[topRow][leftCol]; // nao entendi meu deus meu senhor me ajuda porfavor
                tileNum2 = gp.tileManager.mapTileNum[topRow][rightCol];
                if(gp.tileManager.tile[tileNum1].collision == true|| gp.tileManager.tile[tileNum2].collision == true){
                    player.collisionOn = true;
                }
                break;
            case "sul":
                bottomRow = (bottomY + player.playerSpeed+3) / gp.tileSize;
                tileNum1 = gp.tileManager.mapTileNum[bottomRow][leftCol];
                tileNum2 = gp.tileManager.mapTileNum[bottomRow][rightCol];
                if(gp.tileManager.tile[tileNum1].collision == true|| gp.tileManager.tile[tileNum2].collision == true){
                    player.collisionOn = true;
                }
                break;
            case "leste":
                rightCol = (rightX + player.playerSpeed+3) / gp.tileSize;
                tileNum1 = gp.tileManager.mapTileNum[topRow][rightCol];
                tileNum2 = gp.tileManager.mapTileNum[bottomRow][rightCol];
                if(gp.tileManager.tile[tileNum1].collision == true|| gp.tileManager.tile[tileNum2].collision == true){
                    player.collisionOn = true;
                }
                break;
            case "oeste":
                leftCol = (leftX - player.playerSpeed+3) / gp.tileSize;
                tileNum1 = gp.tileManager.mapTileNum[topRow][leftCol];
                tileNum2 = gp.tileManager.mapTileNum[bottomRow][leftCol];
                break;
            case "sudeste":
                bottomRow = (bottomY + player.playerSpeed+3) / gp.tileSize;
                tileNum1 = gp.tileManager.mapTileNum[bottomRow][leftCol];
                tileNum2 = gp.tileManager.mapTileNum[bottomRow][rightCol];
                if(gp.tileManager.tile[tileNum1].collision == true|| gp.tileManager.tile[tileNum2].collision == true){
                    player.collisionOn = true;
                }
                break;
            case "sudoeste":
                bottomRow = (bottomY + player.playerSpeed+3) / gp.tileSize;
                tileNum1 = gp.tileManager.mapTileNum[bottomRow][leftCol];
                tileNum2 = gp.tileManager.mapTileNum[bottomRow][rightCol];
                if(gp.tileManager.tile[tileNum1].collision == true|| gp.tileManager.tile[tileNum2].collision == true){
                    player.collisionOn = true;
                }
                break;
            case "nordeste":
                topRow = (topY - player.playerSpeed+3) / gp.tileSize;
                tileNum1 = gp.tileManager.mapTileNum[topRow][leftCol]; // nao entendi meu deus meu senhor me ajuda porfavor
                tileNum2 = gp.tileManager.mapTileNum[topRow][rightCol];
                if(gp.tileManager.tile[tileNum1].collision == true|| gp.tileManager.tile[tileNum2].collision == true){
                    player.collisionOn = true;
                }
                break;
            case "noroeste":
                topRow = (topY - player.playerSpeed+3) / gp.tileSize;
                tileNum1 = gp.tileManager.mapTileNum[topRow][leftCol]; // nao entendi meu deus meu senhor me ajuda porfavor
                tileNum2 = gp.tileManager.mapTileNum[topRow][rightCol];
                if(gp.tileManager.tile[tileNum1].collision == true|| gp.tileManager.tile[tileNum2].collision == true){
                    player.collisionOn = true;
                }
                break;
        }

    }
}
