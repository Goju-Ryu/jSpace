/*******************************************************************************
 * Copyright (c) 2017 Michele Loreti and the jSpace Developers (see the included 
 * authors file).
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *******************************************************************************/
package org.jspace.tests;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.URI;

import org.jspace.gate.GateFactory;
import org.jspace.gate.ServerGate;
import org.jspace.gate.TcpGateBuilder;
//import org.jspace.protocol.ServerMessage;
import org.jspace.protocol.ManagementMessage;

import org.junit.Test;

/**
 * @author loreti
 *
 */
//public class TestGates {
//	
//	@Test
//	public void testKeepGate() throws IOException {
//		String uri = "tcp://127.0.0.1:9900/?keep";
//		TcpGateBuilder builder = new TcpGateBuilder();
//		//ServerGate gate = builder.createServerGate(URI.create(uri), ServerMessage.class);
//		ServerGate gate = builder.createServerGate(URI.create(uri), ManagementMessage.class);
//		assertEquals(URI.create(uri), gate.getURI());
//		gate.close();
//	}
//}
