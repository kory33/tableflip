package com.github.kory33.tableflip;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.github.kory33.updatenotificationplugin.bukkit.github.GithubUpdateNotifyPlugin;

public class TableFlip extends GithubUpdateNotifyPlugin{
    @Override
    public void onEnable() {
        super.onEnable();
    }
    
    @Override
    public void onDisable() {
        super.onDisable();
    }    
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("tableflip")) {
            return this.onFlip(sender, args);
        }
        
        if(command.getName().equalsIgnoreCase("unflip")) {
            return this.onUnflip(sender, args);
        }
        return false;
    }
    
    @Override
    public String getGithubRepository() {
        return "Kory33/tableflip";
    }
    
    private boolean onFlip(CommandSender sender, String[] args){
        if (!(sender instanceof Player)) {
            sender.sendMessage("Command is only available for the player.");
            return true;
        }
        Player senderPlayer = (Player) sender;
        senderPlayer.chat("(╯°□°）╯︵ ┻━┻" + String.join(" ", args));
        return true;
    }
    
    private boolean onUnflip(CommandSender sender, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Command is only available for the player.");
            return true;
        }
        Player senderPlayer = (Player) sender;
        senderPlayer.chat("┬─┬﻿ ノ( ゜-゜ノ)" + String.join(" ", args));
        return true;
    }
}
