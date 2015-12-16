/*
 * Copyright 2014 Mansour Rahimi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mnr.java.intellij.idea.plugin.base64helper;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;

/**
 * @author m.rahimi
 */
public class HexEncoderPopupItem extends AbstractPopupItem {

    public static final String TEXT = "Base64 Hex String Encoder";

    @Override
    public String getText() {
        return TEXT;
    }

    @Override
    public Boolean isSelectable(String selectedText) {
        return super.isSelectable(selectedText) && Util.isHex(selectedText);
    }

    @Override
    public String encodeDecode(String selectedText) {
        selectedText = Util.makeEvenHexDigit(selectedText);

        byte[] decodeHex;

        try {
            decodeHex = Hex.decodeHex(selectedText.toCharArray());
        } catch (DecoderException e) {
            e.printStackTrace();
            return null;
        }

        return Base64.encodeBase64String(decodeHex);
    }
}
