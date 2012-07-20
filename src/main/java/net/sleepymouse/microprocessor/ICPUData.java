/*
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.sleepymouse.microprocessor;

public interface ICPUData
{

	/**
	 * Get the processor major CPU version number
	 * 
	 * @return major revision number
	 */
	public String getMajorVersion();

	/**
	 * Get the processor major CPU minor number
	 * 
	 * @return minor revision number
	 */
	public String getMinorVersion();

	/**
	 * Get the processor major CPU patch number
	 * 
	 * @return patch number
	 */
	public String getPatchVersion();

	/**
	 * Get the CPU name string
	 * 
	 * @return name string
	 */
	public String getName();
}
