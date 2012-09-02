/*
Copyright (c) 2012, Adam Retter
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:
    * Redistributions of source code must retain the above copyright
      notice, this list of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above copyright
      notice, this list of conditions and the following disclaimer in the
      documentation and/or other materials provided with the distribution.
    * Neither the name of Adam Retter Consulting nor the
      names of its contributors may be used to endorse or promote products
      derived from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL Adam Retter BE LIABLE FOR ANY
DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.exquery.http;

/**
 * Internet Media Type concepts from RFC 4288
 * 
 * @see http://tools.ietf.org/html/rfc4288
 *
 * @author Adam Retter <adam.retter@googlemail.com>
 */
public interface InternetMediaType {
            
    /**
     * Internet Media Type valid characters from RFC 4288
     * 
     * @see http://tools.ietf.org/html/rfc4288#section-4.2
     * 
     * type-name = reg-name
     * subtype-name = reg-name
     * 
     * reg-name = 1*127reg-name-chars
     * reg-name-chars = ALPHA / DIGIT / "!" /
     *                  "#" / "$" / "&" / "." /
     *                  "+" / "-" / "^" / "_"
     */
    
    public final static String regNameChars_regExp = "[a-z0-9!#\\$&\\.\\+\\-\\^_]";
    public final static String regName_regExp = regNameChars_regExp + "{1,127}";
    
    public final static String typeName_regExp = regName_regExp;
    public final static String subtypeName_regExp = regName_regExp;
    
    public final static char subtypeSeparator = '/';
    
    public final static String mediaType_regExp = typeName_regExp + subtypeSeparator + subtypeName_regExp; 
}
