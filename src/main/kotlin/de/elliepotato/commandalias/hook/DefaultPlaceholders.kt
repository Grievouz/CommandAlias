package de.elliepotato.commandalias.hook

import org.bukkit.entity.Player

/**
 * Created by Ellie on 11/03/2018 for CommandAlias.
 *
 *    Copyright 2018 Ellie
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
class DefaultPlaceholders : CAHook {

    override fun process(message: String, sender: Player): String {
        return message.replace("%name%", sender.name).replace("%display_name%", sender.displayName)
    }

}